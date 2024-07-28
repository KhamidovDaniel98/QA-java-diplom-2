package praktikum.entities.response;

import lombok.Getter;
import lombok.Setter;
import praktikum.entities.request.Ingredient;

import java.util.List;

public class IngredientsResponsed {
    @Getter @Setter
    public String success;
    @Getter @Setter
    public List<Ingredient> data;

    public IngredientsResponsed() { }

    public IngredientsResponsed(String success, List<Ingredient> data) {
        this.success = success;
        this.data = data;
    }
}
