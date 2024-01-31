package ru.vood.graph.engine.dto

interface IActionNode : INode{
    fun generate(context: IContext): IContext
}
