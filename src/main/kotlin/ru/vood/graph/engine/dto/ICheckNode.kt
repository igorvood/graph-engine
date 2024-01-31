package ru.vood.graph.engine.dto

interface ICheckNode : INode {

    fun check(context: IContext): IError?
}
