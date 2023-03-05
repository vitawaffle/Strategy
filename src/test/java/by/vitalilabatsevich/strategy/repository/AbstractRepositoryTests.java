package by.vitalilabatsevich.strategy.repository;

abstract class AbstractRepositoryTests {

    abstract void initializeTestData();

    abstract void cleanUpData();

    void withTestData(RepositoryMethodTest test) {
        initializeTestData();
        test.test();
        cleanUpData();
    }

}
