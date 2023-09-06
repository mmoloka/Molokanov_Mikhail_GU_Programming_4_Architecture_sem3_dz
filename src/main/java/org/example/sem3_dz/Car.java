package org.example.sem3_dz;

public abstract class Car {
    //region Constructors

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadlights();

    // Включение дворников
    public abstract boolean switchWipers();

    // Подметать
    //public abstract void sweeping();

    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String mark;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    protected int wheelsCount;

    // Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    protected GearboxType gearboxType;

    // Объем двигателя
    protected double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;


    //endregion
}
