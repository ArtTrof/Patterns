package practicing.abstract_factory;

import practicing.abstract_factory.chromosomes.Chromosome;
import practicing.abstract_factory.factories.HumanFactory;
import practicing.abstract_factory.sex.Sex;

public class Child {
    private Sex sex;
    private Chromosome chromosome;

    public Child(HumanFactory humanFactory) {
        this.sex = humanFactory.setSex();
        this.chromosome = humanFactory.setChromosome();
    }

    public void info() {
        sex.info();
        chromosome.info();
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Chromosome getChromosome() {
        return chromosome;
    }

    public void setChromosome(Chromosome chromosome) {
        this.chromosome = chromosome;
    }
}
