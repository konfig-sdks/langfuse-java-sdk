package com.konfigthis.client;

import com.konfigthis.client.api.DatasetItemsApi;
import com.konfigthis.client.api.DatasetRunItemsApi;
import com.konfigthis.client.api.DatasetsApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.IngestionApi;
import com.konfigthis.client.api.MetricsApi;
import com.konfigthis.client.api.ObservationsApi;
import com.konfigthis.client.api.ProjectsApi;
import com.konfigthis.client.api.PromptsApi;
import com.konfigthis.client.api.ScoreApi;
import com.konfigthis.client.api.SessionsApi;
import com.konfigthis.client.api.TraceApi;

public class Langfuse {
    private ApiClient apiClient;
    public final DatasetItemsApi datasetItems;
    public final DatasetRunItemsApi datasetRunItems;
    public final DatasetsApi datasets;
    public final HealthApi health;
    public final IngestionApi ingestion;
    public final MetricsApi metrics;
    public final ObservationsApi observations;
    public final ProjectsApi projects;
    public final PromptsApi prompts;
    public final ScoreApi score;
    public final SessionsApi sessions;
    public final TraceApi trace;

    public Langfuse() {
        this(null);
    }

    public Langfuse(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.datasetItems = new DatasetItemsApi(this.apiClient);
        this.datasetRunItems = new DatasetRunItemsApi(this.apiClient);
        this.datasets = new DatasetsApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.ingestion = new IngestionApi(this.apiClient);
        this.metrics = new MetricsApi(this.apiClient);
        this.observations = new ObservationsApi(this.apiClient);
        this.projects = new ProjectsApi(this.apiClient);
        this.prompts = new PromptsApi(this.apiClient);
        this.score = new ScoreApi(this.apiClient);
        this.sessions = new SessionsApi(this.apiClient);
        this.trace = new TraceApi(this.apiClient);
    }

}
