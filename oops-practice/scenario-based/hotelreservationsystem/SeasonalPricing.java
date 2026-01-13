class SeasonalPricing implements PricingStrategy {
    public double calculate(double basePrice, int days) {
        return basePrice * days * 1.5;
    }
}