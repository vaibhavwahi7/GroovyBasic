class Question5 {

    static void main(String[] args) {

        List a=[]
        List list = new ArrayList()
        if("Test") { println "test evaluated to true inside if" }
        if('null') { println "test evaluated to true inside if" }
        if(100) { println "test evaluated to true inside if" }
        if(0) { println "test evaluated to true inside if" }
        if(a) { println "test evaluated to true inside if" }
        if(list){ println "test evaluated to true inside if" }
        def x = 100
        def y = 10

        def hourMinute=new HourMinute()
        hourMinute.hh=23
        hourMinute.mm=59



        hourMinute.incHh()
        hourMinute.decHh()
        hourMinute.incMm()
        hourMinute.decHh()
        hourMinute.incHh()

        hourMinute.decMm()
        hourMinute.incHh()
        hourMinute.incMm()

       println x + y == 110

       println x.plus(y) == 110
    }
}




class HourMinute {

    def hh
    def mm

    void incHh() {

        hh++


        check()


    }

    void incMm() {

        if (mm == 59) {
            hh++

        }
        mm++

        check()


    }

    void decHh() {

        hh--
        check()


    }

    void decMm() {

        if (mm == 00) {
            hh--
        }
        mm--


        check()


    }

    void check() {
        if (hh > 23) {
            hh = 00
        }
        if (mm > 59) {
            mm = 00
        }
        if (mm < 0) {
            mm = 59
        }
        if (hh < 0) {
            hh = 23
        }
        println("TIME =$hh : $mm")


    }


}
