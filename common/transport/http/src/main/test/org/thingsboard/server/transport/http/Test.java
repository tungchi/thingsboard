package org.thingsboard.server.transport.http;

/**
 * @author yingkefa
 * @date 2022年04月15日14:29:08
 */
public class Test {
    TestInterface testService;

    public void setTestService() {
        this.testService = test();
    }

    public TestInterface test() {
        return testData -> {
            testData.setAge(21);
            testData.setName("thingsboard");
            System.out.println("testData:" + testData);
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setTestService();
        test.testService.print(new TestData());
    }
}
