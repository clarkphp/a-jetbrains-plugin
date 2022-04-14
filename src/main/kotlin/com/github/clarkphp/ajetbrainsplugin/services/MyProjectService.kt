package com.github.clarkphp.ajetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.clarkphp.ajetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
