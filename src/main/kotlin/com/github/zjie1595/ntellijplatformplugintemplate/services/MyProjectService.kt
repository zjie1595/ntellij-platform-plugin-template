package com.github.zjie1595.ntellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.zjie1595.ntellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
