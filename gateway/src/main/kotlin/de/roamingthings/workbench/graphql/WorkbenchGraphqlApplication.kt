package de.roamingthings.workbench.graphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkbenchGraphqlApplication

fun main(args: Array<String>) {
	runApplication<WorkbenchGraphqlApplication>(*args)
}
