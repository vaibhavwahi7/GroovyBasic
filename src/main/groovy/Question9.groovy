class Question9 {
    static void main(String[] args) {
        def a = new File("/home/vaibhav/Downloads/D/file1")
def i=0
        a.bytes=[]
        new File("/home/vaibhav/Downloads/Dir/file4").eachLine { line ->
            if(i%2==0)
            {
                println line
                a << line << "\n"
            }
            i++
        }
    }}
