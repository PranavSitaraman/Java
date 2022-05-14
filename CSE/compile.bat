del Output /S /Q
mkdir Output
"C:/Program Files/Java/jdk1.8.0_333/bin/javac.exe" -d Output *.java
cd Output
start "Java" "C:/Program Files/Java/jdk1.8.0_333/bin/java.exe" main