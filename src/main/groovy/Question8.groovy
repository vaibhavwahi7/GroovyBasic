import javax.naming.spi.DirectoryManager

class Question8 {

    static void main(String[] args) {
        def a = new File("/home/vaibhav/Downloads/D/file")

        new File("/home/vaibhav/Downloads/Dir").eachFile() { file ->
            a << file.getText()

        }
    }
}
