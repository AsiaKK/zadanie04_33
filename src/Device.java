public class Device {

    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }

    public String getInfo() {
        String info =
                "KOD: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: " + this.price;
        return info;
    }
}
