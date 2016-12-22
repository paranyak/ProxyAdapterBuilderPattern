package com.paranyak.builder;

/**
 * Created by cs.ucu.edu.ua on 12/22/2016.
 */
public class TestBuilder {
    private IComputer builder;

    public TestBuilder(final IComputer builder) {
        this.builder = builder;
    }

    /**
     * Create builder (new computer) with following specifications
     * @return String with information about computer
     */
    public ComputerBuilder construct() {
        builder.setPower(4);
        builder.setColor("White");
        return builder.getResult();
    }

    public static void main(final String[] arguments) {
        IComputer builder = new ComputerBuilderImp();
        TestBuilder carBuildDirector = new TestBuilder(builder);
        System.out.println(carBuildDirector.construct());
    }
}
