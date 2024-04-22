# Regla para compilar Main.java
compile:
	javac Main.java

# Regla para ejecutar Main con el parámetro "config.csv"
run: compile
	java Main config.csv

# Regla para limpiar los archivos .class
clean:
	rm -f *.class