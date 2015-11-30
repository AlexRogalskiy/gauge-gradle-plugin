package com.thoughtworks.gauge.gradle;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GaugeExtensionTest {
    @Test
    public void shouldLoadDefaultProperties() {
        Project project = ProjectBuilder.builder().build();
        GaugeExtension gauge = project.getExtensions().create("gauge", GaugeExtension.class);

        assertNotNull(gauge);
        assertNull(gauge.getSpecsDir());
        assertFalse(gauge.isInParallel());
        assertNull(gauge.getNodes());
        assertNull(gauge.getEnv());
        assertNull(gauge.getTags());
        assertNull(gauge.getClasspath());
        assertNull(gauge.getAdditionalFlags());
    }
}