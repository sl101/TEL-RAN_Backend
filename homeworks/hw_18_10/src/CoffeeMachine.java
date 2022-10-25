import java.util.Formatter;

public class CoffeeMachine {
    String selectedDrink;
    String espresso;
    String cappuccino;
    String americano;
    String tea;
    String error;

    public CoffeeMachine(String selectedDrink) {
        this.espresso = makeEspresso();
        this.cappuccino = makeCappuccino();
        this.americano = makeAmericano();
        this.tea = makeTea();
        this.error = errorMessage();
        this.selectedDrink = selectedDrink;
    }

    private String makeDrink(String selectedDrink){
        return switch (selectedDrink){
            case "espresso"-> String.format("%s Ваш еспрессо готов !!!", espresso);
            case "americano"-> String.format("%s Ваш американо готов !!!", americano);
            case "cappuccino"-> String.format("%s Ваш каппучино готов !!!", cappuccino);
            case "tea"-> String.format("%s Ваш чай готов !!!", tea);
            default-> String.format("%s", error);
        };
    }

    private String makeEspresso(){
        return "Готовим еспрессо ...<br/>";
    }
    private String makeCappuccino(){
        return makeEspresso() +
                addHotWater();
    }
    private String makeAmericano(){
        return makeEspresso()+
                addFrothedMilk();
    }
    private String makeTea(){
        return "Выбираем пакетик чая ...<br/>"+
                addHotWater();
    }
    private String addFrothedMilk(){
        return "Добавляем вспененное молоко ...<br/>";
    }
    private String addHotWater(){
        return "Добавляем кипяченую воду ...<br/>";
    }
    private String errorMessage(){
        return "Воды нет ...";
    }

    public String getCookingMessage() {
        return makeDrink(selectedDrink);
    }
}
