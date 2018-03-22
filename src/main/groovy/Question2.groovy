class Question2 extends Person {

    def empId
    def company
    def salary

    static void main(String[] args) {

        Question2 e = new Question2()

        println("One is by getter methods\n")

        e.setEmpId(1)
        e.setCompany("TTN")
        e.setSalary(25000)
        println(e.getEmpId())
        println(e.getCompany())
        println(e.getSalary())

        println("\nSecond is by Dot Operator\n")

        println(e.empId)
        println(e.salary)
        println(e.company)

        println("\nThird is by @ Method\n")

        println(e.@empId)
        println(e.@company)
        println(e.@salary)

    }
}