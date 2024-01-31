package ru.vood.graph.engine.dto

interface ISubGraph {

    val generator: IGeneratorNode

    val dependencyGraphs: Set<ISubGraph>
}