class Question10
{


static void main(String[] args) {
    def a = new File("/home/vaibhav/Downloads/D/file2")
a.bytes=[]
    new File("/home/vaibhav/Downloads/Dir/file4").eachLine{ file ->
        a << file.split(" ").join("").trim()

    }
  }
}