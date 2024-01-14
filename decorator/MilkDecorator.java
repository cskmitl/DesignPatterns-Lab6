public class MilkDecorator implements BeverageDecorator {
    private Beverage baseBeverage;

    public MilkDecorator(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public int getCost() {
        // ราคานมเพิ่มขึ้น 6 บาท
        return baseBeverage.getCost() + 6;
    }

    @Override
    public String getDescription() {
        // เพิ่มรายละเอียดการเติมนม
        return baseBeverage.getDescription() + "milk ";
    }

    @Override
    public Beverage getBaseBeverage() {
        return baseBeverage;
    }
}
