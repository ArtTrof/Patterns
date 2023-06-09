package practicing.abstract_factory.factories;

import practicing.abstract_factory.chromosomes.Chromosome;
import practicing.abstract_factory.chromosomes.XyChromosome;
import practicing.abstract_factory.sex.Sex;
import practicing.abstract_factory.sex.Woman;

public class FemaleFactory implements HumanFactory{
    @Override
    public Chromosome setChromosome() {
        return new XyChromosome();
    }

    @Override
    public Sex setSex() {
        return new Woman();
    }
}
