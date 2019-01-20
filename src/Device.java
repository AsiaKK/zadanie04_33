public class Device {

    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = 0.0;
    }

    public Device(String code, String producer, String type, double price) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public String getInfo() {
        String info =
                "KOD: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: " + this.price;
        return info;
    }
}
