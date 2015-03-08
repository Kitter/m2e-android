/*******************************************************************************
 * Copyright (c) 2013, 2014, 2015 Ricardo Gladwell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package me.gladwell.eclipse.m2e.android.configuration.classpath;

import me.gladwell.eclipse.m2e.android.project.IDEAndroidProject;
import me.gladwell.eclipse.m2e.android.project.MavenAndroidProject;

public class MarkAndroidClasspathContainerNotExportedConfigurer implements ClasspathConfigurer {

    public boolean shouldApplyTo(MavenAndroidProject project) {
        return true;
    }

    public void configure(MavenAndroidProject mavenProject, IDEAndroidProject eclipseProject) {
        eclipseProject.getClasspath().getAndroidClasspathContainer().markNotExported();
    }

}
