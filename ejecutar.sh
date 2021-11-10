set -e
cd src
mkdir ../comp
javac test/Main.java -cp . -d ../comp/
cd ../comp
java test.Main
cd ..
rm -r comp