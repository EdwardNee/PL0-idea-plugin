package pl0ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.edwardnee.pl0ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
