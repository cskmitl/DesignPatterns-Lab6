public class SugarDecorator implements BeverageDecorator {
    private Beverage baseBeverage;

    public SugarDecorator(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public int getCost() {
        // ราคาน้ำตาลเพิ่มขึ้น 1 บาท
        return baseBeverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        // เพิ่มรายละเอียดการเติมน้ำตาล
        return baseBeverage.getDescription() + "sugar ";
    }

    @Override
    public Beverage getBaseBeverage() {
        return baseBeverage;
    }
}
