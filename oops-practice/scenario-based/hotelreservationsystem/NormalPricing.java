class NormalPricing implements PricingStrategy {
    public double calculate(double basePrice, int days) {
        return basePrice * days;
    }
}



