// คลาส Adapter สำหรับ StockMarketDataParser
public class StockMarketDataParserAdapter implements CSVParser {

    public StockMarketDataParser stockMarketDataParser;

    public StockMarketDataParserAdapter(StockMarketDataParser stockMarketDataParser) {
        this.stockMarketDataParser = stockMarketDataParser;
    }

    @Override
    public void parseCSV() {
        stockMarketDataParser.parseFromCSV();
    }
}
