package practicing.abstract_factory.factories;

import practicing.abstract_factory.chromosomes.Chromosome;
import practicing.abstract_factory.chromosomes.XxChromosome;
import practicing.abstract_factory.sex.Sex;
import practicing.abstract_factory.sex.Male;

public class MaleFactory implements HumanFactory {
    @Override
    public Chromosome setChromosome() {
        return new XxChromosome();
    }

    @Override
    public Sex setSex() {
        return new Male();
    }
}
