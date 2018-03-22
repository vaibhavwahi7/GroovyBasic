class Question6 {
    static void main(String[] args) {

        println("This is first method\n")
        def n = 1
        10.times {
            println n * 3
            n++
        }

        println("\nThis is second method\n")
        def j = 1
        j.upto(10)
                {
                    println j * 3
                    j++
                }


        println("\nThis is third method\n")
        def k = 1
        k.step 11, 1,
                {
                    println k * 3
                    k++
                }
    }
}