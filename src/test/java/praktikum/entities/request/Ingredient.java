package praktikum.entities.request;

import lombok.Getter;
import lombok.Setter;

public class Ingredient {
    @Getter
    @Setter
    private String _id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String type;
    @Getter @Setter
    private String proteins;
    @Getter @Setter
    private String fat;
    @Getter @Setter
    private String carbohydrates;
    @Getter @Setter
    private String calories;
    @Getter @Setter
    private String price;
    @Getter @Setter
    private String image;
    @Getter @Setter
    private String imageMobile;
    @Getter @Setter
    private String imageLarge;
    @Getter @Setter
    private String __v;

    public Ingredient() { }

    public Ingredient(String _id, String name, String type, String proteins, String fat,
                        String carbohydrates, String calories, String price, String image,
                        String image_mobile, String image_large, String __v) {
        this._id = _id;
        this.name = name;
        this.type = type;
        this.proteins = proteins;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.price = price;
        this.image = image;
        this.imageMobile = image_mobile;
        this.imageLarge = image_large;
        this.__v = __v;
    }
}
