public class JPGtoPDF implements IConverter {
    @Override
    public void specificConverter(String inputFileName, String outputFileName){
        System.out.println("Converting JPG to PDF:" + inputFileName + "->" + outputFileName);
    }
}
