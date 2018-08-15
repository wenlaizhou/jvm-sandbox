import com.alibaba.jvm.sandbox.agent.main.MyInterface

class Print implements MyInterface {

    String print() {
        return "hello world"
    }
}