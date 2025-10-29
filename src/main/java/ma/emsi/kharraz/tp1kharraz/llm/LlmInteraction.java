package ma.emsi.kharraz.tp1kharraz.llm;

/**
 * Représente une interaction avec l'API du LLM (requête et réponse).
 * Contient la requête JSON, la réponse JSON et la réponse extraite en texte simple.
 *
 * @param questionJson la requête JSON envoyée à l'API
 * @param reponseJson la réponse JSON reçue de l'API
 * @param reponseExtraite la réponse extraite en texte simple
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {}
