abstract class Logger{
    public abstract void loggingInfo(String msg);
}
class LoggerInfo extends Logger{
    @Override
    public void loggingInfo(String msg){
        System.out.println(msg);
    }
}//class Logger{
//    public void logger(String msg){
//        System.out.println(msg);
// }}class LoggingFile{
//        Logger logger;
//        LoggingFile(Logger l){
//            this.logger=l;}
//        public void loggingInfo(){
//            logger.logger("info about logging");
//     }
//    }
class PrincipleDependencyInversion {
    public static void main(String[] args) {
//        LoggingFile l=new LoggingFile(new Logger());
//l.loggingInfo();
LoggerInfo l=new LoggerInfo();
l.loggingInfo("string message");
}
}