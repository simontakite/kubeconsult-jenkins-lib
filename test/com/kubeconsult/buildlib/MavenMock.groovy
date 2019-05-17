package com.kubeconsult.buildlib

class MavenMock extends Maven {
    String args

    MavenMock(scriptMock) {
        super(scriptMock)
    }

    def mvn(String args) {
        this.args = args
    }
}