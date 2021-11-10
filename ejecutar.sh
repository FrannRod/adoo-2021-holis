set -e
cd src
javac test/Main.java -cp . -d ../comp/
cd ../comp
java test.Main
cd ..
rm -r comp