//package log;
//
//import lombok.experimental.Helper;
//
//import java.util.function.Consumer;
//
//public class HelperExample {
//    int someMethod(int arg1) {
//        int localVar = 5;
//
//
//        @Helper
//        class Helpers {
//            public int helperMethod(int arg) {
//                return arg + localVar;
//            }
//        }
//
//        return helperMethod(10);
//    }
//}