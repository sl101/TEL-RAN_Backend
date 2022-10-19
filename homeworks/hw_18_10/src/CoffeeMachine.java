public class CoffeeMachine {
    String selectedDrink;

    public CoffeeMachine(String selectedDrink) {
        this.selectedDrink = selectedDrink;
    }

    private String makeDrink(String selectedDrink){
        return switch (selectedDrink){
            case "espresso"-> makeEspresso() + "Ваш еспрессо готов !!!";
            case "americano"-> makeCappuccino() + "Ваш американо готов !!!";
            case "cappuccino"-> makeAmericano() + "Ваш каппучино готов !!!";
            case "tea"-> makeTea() + "Ваш чай готов !!!";
            default-> errorMessage();
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
