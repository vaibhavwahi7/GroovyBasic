class Question7 {
    static void main(String[] args) {


        Closure closure = { List list, num2 ->
            if (list.contains(num2)) {
                println "true"
            }
            else
            {
                println "false"
            }

        }

        closure([1,2,3,4,5], 2)
    }
}