class Question4 extends Person{


    static void main(String[] args)
    {
        def msg="\"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and draws \$\$\$\$\$\$\$ lots of money !!!!."
        def name="Message is ,${msg}"
        Person p=new Person()
        p.setName(name)
        println (p.getName())
    }

    }

