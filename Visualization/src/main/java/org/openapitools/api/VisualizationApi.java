/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.OpcionesVisualizacion;
import org.openapitools.model.Visualizacion;
import org.openapitools.model.VisualizationUserIDFilmFilmIDDownloadPost200Response;
import org.openapitools.model.VisualizationUserIDFilmFilmIDLanguagePostRequest;
import org.openapitools.model.VisualizationUserIDFilmFilmIDSubtitlesPostRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "Visualization", description = "Este endpoint maneja las diferentes operaciones sobre las visualizaciones")
public interface VisualizationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /visualization/{userID}/continue-watching : Obtener la lista de contenido \&quot;Seguir Viendo\&quot;
     * Recupera los elementos que el usuario ha comenzado a ver pero no ha terminado.
     *
     * @param userID ID del usuario que desea obtener la lista de \&quot;Seguir Viendo\&quot; (required)
     * @return Lista de contenido \&quot;Seguir Viendo\&quot; obtenida correctamente. (status code 200)
     *         or No se encontraron elementos \&quot;Seguir Viendo\&quot; (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDContinueWatchingGet",
        summary = "Obtener la lista de contenido \"Seguir Viendo\"",
        description = "Recupera los elementos que el usuario ha comenzado a ver pero no ha terminado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de contenido \"Seguir Viendo\" obtenida correctamente.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Visualizacion.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No se encontraron elementos \"Seguir Viendo\""),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/visualization/{userID}/continue-watching",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Visualizacion>> visualizationUserIDContinueWatchingGet(
        @Parameter(name = "userID", description = "ID del usuario que desea obtener la lista de \"Seguir Viendo\"", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"filmID\" : 1, \"visualizationID\" : 1, \"serieID\" : 1, \"userID\" : 1, \"visualizationDate\" : \"2023-10-09T12:00:00Z\", \"progreso\" : \"Viendo\" }, { \"filmID\" : 1, \"visualizationID\" : 1, \"serieID\" : 1, \"userID\" : 1, \"visualizationDate\" : \"2023-10-09T12:00:00Z\", \"progreso\" : \"Viendo\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/download : Descargar contenido
     * Permite al usuario autenticado descargar la pelicula especificado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a descargar. (required)
     * @return Descarga hecha exitosamente (status code 200)
     *         or Error en los datos para descargar la pelicula (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDDownloadPost",
        summary = "Descargar contenido",
        description = "Permite al usuario autenticado descargar la pelicula especificado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Descarga hecha exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VisualizationUserIDFilmFilmIDDownloadPost200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para descargar la pelicula"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/download",
        produces = { "application/json" }
    )
    
    default ResponseEntity<VisualizationUserIDFilmFilmIDDownloadPost200Response> visualizationUserIDFilmFilmIDDownloadPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a descargar.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"Descarga realizada exitosamente\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/end : Finaliza la reproduccion de una pelicula.
     * Finaliza la reproducción de una pelicula existente para el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a reproducir. (required)
     * @return Reproducción finalizada (status code 201)
     *         or Error en los datos de reproducción (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDEndPost",
        summary = "Finaliza la reproduccion de una pelicula.",
        description = "Finaliza la reproducción de una pelicula existente para el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Reproducción finalizada"),
            @ApiResponse(responseCode = "400", description = "Error en los datos de reproducción"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/end"
    )
    
    default ResponseEntity<Void> visualizationUserIDFilmFilmIDEndPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a reproducir.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/language : Cambia el idioma para la pelicula
     * Cambia el idioma de reproducción de la pelicula especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a cambiar el idioma. (required)
     * @param visualizationUserIDFilmFilmIDLanguagePostRequest  (required)
     * @return Idioma cambiado exitosamente (status code 200)
     *         or Error en los datos para cambiar el idioma (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDLanguagePost",
        summary = "Cambia el idioma para la pelicula",
        description = "Cambia el idioma de reproducción de la pelicula especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Idioma cambiado exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para cambiar el idioma"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/language",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDLanguagePost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a cambiar el idioma.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID,
        @Parameter(name = "VisualizationUserIDFilmFilmIDLanguagePostRequest", description = "", required = true) @Valid @RequestBody VisualizationUserIDFilmFilmIDLanguagePostRequest visualizationUserIDFilmFilmIDLanguagePostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/pause : Pausar reproducción
     * Pausa la reproducción de la pelicula especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a pausar. (required)
     * @return Reproducción pausada exitosamente (status code 200)
     *         or Error en los datos para pausar (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDPausePost",
        summary = "Pausar reproducción",
        description = "Pausa la reproducción de la pelicula especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Reproducción pausada exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para pausar"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/pause",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDPausePost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a pausar.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/play : Iniciar la reproduccion de una pelicula.
     * Inicia la reproducción de una pelicula existente para el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a reproducir. (required)
     * @return Reproducción iniciada (status code 201)
     *         or Error en los datos de reproducción (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDPlayPost",
        summary = "Iniciar la reproduccion de una pelicula.",
        description = "Inicia la reproducción de una pelicula existente para el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Reproducción iniciada", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos de reproducción"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/play",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDPlayPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a reproducir.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/film/{filmID}/subtitles : Cambia el estado de los subtítulos
     * Activa o desactiva los subtítulos para la pelicula especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param filmID ID de la pelicula que se va a cambiar los subtitulos. (required)
     * @param visualizationUserIDFilmFilmIDSubtitlesPostRequest  (required)
     * @return Subtítulos activados exitosamente (status code 200)
     *         or Error en los datos para activar subtítulos (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Pelicula no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDFilmFilmIDSubtitlesPost",
        summary = "Cambia el estado de los subtítulos",
        description = "Activa o desactiva los subtítulos para la pelicula especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Subtítulos activados exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para activar subtítulos"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Pelicula no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/film/{filmID}/subtitles",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDFilmFilmIDSubtitlesPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "filmID", description = "ID de la pelicula que se va a cambiar los subtitulos.", required = true, in = ParameterIn.PATH) @PathVariable("filmID") Integer filmID,
        @Parameter(name = "VisualizationUserIDFilmFilmIDSubtitlesPostRequest", description = "", required = true) @Valid @RequestBody VisualizationUserIDFilmFilmIDSubtitlesPostRequest visualizationUserIDFilmFilmIDSubtitlesPostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/download : Descargar contenido
     * Permite al usuario autenticado descargar la serie especificado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a descargar. (required)
     * @return Descarga hecha exitosamente (status code 200)
     *         or Error en los datos para descargar la serie (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDDownloadPost",
        summary = "Descargar contenido",
        description = "Permite al usuario autenticado descargar la serie especificado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Descarga hecha exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VisualizationUserIDFilmFilmIDDownloadPost200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para descargar la serie"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/download",
        produces = { "application/json" }
    )
    
    default ResponseEntity<VisualizationUserIDFilmFilmIDDownloadPost200Response> visualizationUserIDSerieSerieIDDownloadPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a descargar.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"Descarga realizada exitosamente\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/end : Finaliza la reproduccion de una serie.
     * Finaliza la reproducción de una serie existente para el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a reproducir. (required)
     * @return Reproducción finalizada (status code 201)
     *         or Error en los datos de reproducción (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDEndPost",
        summary = "Finaliza la reproduccion de una serie.",
        description = "Finaliza la reproducción de una serie existente para el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Reproducción finalizada"),
            @ApiResponse(responseCode = "400", description = "Error en los datos de reproducción"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/end"
    )
    
    default ResponseEntity<Void> visualizationUserIDSerieSerieIDEndPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a reproducir.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/language : Cambia el idioma para la serie
     * Cambia el idioma de reproducción de la serie especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a cambiar el idioma. (required)
     * @param visualizationUserIDFilmFilmIDLanguagePostRequest  (required)
     * @return Idioma cambiado exitosamente (status code 200)
     *         or Error en los datos para cambiar el idioma (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDLanguagePost",
        summary = "Cambia el idioma para la serie",
        description = "Cambia el idioma de reproducción de la serie especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Idioma cambiado exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para cambiar el idioma"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/language",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDLanguagePost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a cambiar el idioma.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID,
        @Parameter(name = "VisualizationUserIDFilmFilmIDLanguagePostRequest", description = "", required = true) @Valid @RequestBody VisualizationUserIDFilmFilmIDLanguagePostRequest visualizationUserIDFilmFilmIDLanguagePostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/pause : Pausar reproducción
     * Pausa la reproducción de la serie especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a pausar. (required)
     * @return Reproducción pausada exitosamente (status code 200)
     *         or Error en los datos para pausar (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDPausePost",
        summary = "Pausar reproducción",
        description = "Pausa la reproducción de la serie especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Reproducción pausada exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para pausar"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/pause",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDPausePost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a pausar.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/play : Iniciar la reproduccion de una serie.
     * Inicia la reproducción de una serie existente para el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a reproducir. (required)
     * @return Reproducción iniciada (status code 201)
     *         or Error en los datos de reproducción (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDPlayPost",
        summary = "Iniciar la reproduccion de una serie.",
        description = "Inicia la reproducción de una serie existente para el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Reproducción iniciada", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos de reproducción"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/play",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDPlayPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a reproducir.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /visualization/{userID}/serie/{serieID}/subtitles : Cambia el estado de los subtítulos
     * Activa o desactiva los subtítulos para la serie especificado por el usuario autenticado.
     *
     * @param userID ID del usuario (required)
     * @param serieID ID de la serie que se va a cambiar los subtitulos. (required)
     * @param visualizationUserIDFilmFilmIDSubtitlesPostRequest  (required)
     * @return Subtítulos activados exitosamente (status code 200)
     *         or Error en los datos para activar subtítulos (status code 400)
     *         or Usuario no autenticado (status code 401)
     *         or Serie no encontrada (status code 404)
     *         or Error en el servidor (status code 500)
     */
    @Operation(
        operationId = "visualizationUserIDSerieSerieIDSubtitlesPost",
        summary = "Cambia el estado de los subtítulos",
        description = "Activa o desactiva los subtítulos para la serie especificado por el usuario autenticado.",
        tags = { "Visualization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Subtítulos activados exitosamente", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpcionesVisualizacion.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error en los datos para activar subtítulos"),
            @ApiResponse(responseCode = "401", description = "Usuario no autenticado"),
            @ApiResponse(responseCode = "404", description = "Serie no encontrada"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visualization/{userID}/serie/{serieID}/subtitles",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<OpcionesVisualizacion> visualizationUserIDSerieSerieIDSubtitlesPost(
        @Parameter(name = "userID", description = "ID del usuario", required = true, in = ParameterIn.PATH) @PathVariable("userID") Integer userID,
        @Parameter(name = "serieID", description = "ID de la serie que se va a cambiar los subtitulos.", required = true, in = ParameterIn.PATH) @PathVariable("serieID") Integer serieID,
        @Parameter(name = "VisualizationUserIDFilmFilmIDSubtitlesPostRequest", description = "", required = true) @Valid @RequestBody VisualizationUserIDFilmFilmIDSubtitlesPostRequest visualizationUserIDFilmFilmIDSubtitlesPostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"estado\" : \"reproduciendo\", \"visualizationID\" : 1, \"idioma\" : \"español\", \"subtitulos\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
