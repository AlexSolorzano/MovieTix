
compile:
	javac -cp .:WEB-INF/lib/* ../src/*.java -d WEB-INF/classes/

war: compile
	jar -cvf MovieTix.war *
	mv MovieTix.war  ../../wildfly-12.0.0.Final/standalone/deployments/

clean:
	rm -rf WEB-INF/classes/*
