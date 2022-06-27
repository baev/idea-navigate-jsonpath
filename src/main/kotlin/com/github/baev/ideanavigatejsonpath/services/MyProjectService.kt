package com.github.baev.ideanavigatejsonpath.services

import com.intellij.openapi.project.Project
import com.github.baev.ideanavigatejsonpath.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
