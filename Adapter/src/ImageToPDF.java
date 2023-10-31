public class ImageToPDF implements PDF{
    private IConverter converter;
    public ImageToPDF(IConverter converter){
        this.converter = converter;
    }

    @Override
    public void convertToPDF(String inputFileName, String outputFileName){
        converter.specificConverter(inputFileName, outputFileName);
    }
}
