package one.digitalinnovation.collections

// Neste exemplo posso criar um mapa de qualquer tipo que será o <T> //
class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun Create(id: String, value: T) {
        map[id] = value                     // Adiciona um ítem T com uma chave ID ao mapa.
    }

    fun Remove(id: String) = map.remove(id) // Remove um ítem do mapa identificado pela chave ID.

    fun FindById(id: String) = map[id]      // Retorna um ítem do mapa identificado pela chave ID.

    fun FindAll() = map.values              // Retorna todos os ítens do mapa.
}