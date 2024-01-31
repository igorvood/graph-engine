package ru.vood.graph.engine.dto

interface IGeneratorNode : INode{

    fun generate(context: IContext): Set<INode>

}
