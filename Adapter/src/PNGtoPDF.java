public class PNGtoPDF implements IConverter{
    @Override
    public void specificConverter(String inputFileName, String outputFileName){
        System.out.println("Converting PNG to PDF:" + inputFileName + "->" + outputFileName);
    }
}
