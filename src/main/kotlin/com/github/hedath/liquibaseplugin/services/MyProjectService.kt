package com.github.hedath.liquibaseplugin.services

import com.intellij.openapi.project.Project
import com.github.hedath.liquibaseplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
