freeStyleJob('Disk Space Check'){
	steps {
		shell("df")
	}

}
freeStyleJob('Daily Dose of Satisfaction'){
	parameters{
		stringParam("NAME", "default", "Ton nom stp")
	}
	steps{
		shell('echo "Hello dear $NAME"')
		shell("date")
		shell('echo "This is your DDoS number $BUILD_NUMBER"')
	}
}

