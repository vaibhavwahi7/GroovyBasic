class Question11 {
    static void main(String[] args) {

        InputStream inputStream = new FileInputStream("/home/vaibhav/Downloads/Dir/img.jpg")
        OutputStream outputStream = new FileOutputStream("/home/vaibhav/Downloads/D/copy")
        byte[] buffer = new byte[1024]
        int length
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length)
        }
    }
}